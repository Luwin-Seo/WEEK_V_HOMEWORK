package com.example.week_v_homework.service;

import com.example.week_v_homework.dto.order.OrderDetailRequestDto;
import com.example.week_v_homework.dto.order.OrderDetailResponseDto;
import com.example.week_v_homework.dto.order.OrderRequestDto;
import com.example.week_v_homework.dto.order.OrderResponseDto;
import com.example.week_v_homework.model.Food;
import com.example.week_v_homework.model.Order;
import com.example.week_v_homework.model.OrderDetail;
import com.example.week_v_homework.model.Restaurant;
import com.example.week_v_homework.repository.FoodRepository;
import com.example.week_v_homework.repository.OrderDetailRepository;
import com.example.week_v_homework.repository.OrderRepository;
import com.example.week_v_homework.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final FoodRepository foodRepository;
    private final OrderDetailRepository orderDetailRepository;
    private final RestaurantRepository restaurantRepository;

    public OrderResponseDto orderRequest(OrderRequestDto requestDto) {

        //Order Entity 조립을 위해 먼저 Order 선언
        Order order = new Order();
        Restaurant restaurant = restaurantRepository.findById(requestDto.getRestaurantId()).orElseThrow(
                () -> new NullPointerException("해당 식당이 존재하지 않습니다")
        );
        //Order 레코드 조립
        order.setRestaurantName(restaurant.getName());
        order.setDeliveryFee(restaurant.getDeliveryFee());
        int sum = 0;
        for (int i = 0; i < requestDto.getOrderDetailsRq().size(); i++) {
            Food food = foodRepository.findById(requestDto.getOrderDetailsRq().get(i).getFoodId()).orElseThrow(
                    () -> new NullPointerException("해당 음식이 존재하지 않습니다")
            );
            sum += food.getPrice() * requestDto.getOrderDetailsRq().get(i).getQuantity();
        }
        order.setTotalPrice(sum + restaurant.getDeliveryFee());

        //조립된 order 레코드 저장
        orderRepository.save(order);


        //orderDetail 과 orderDetailResponse 를 함께 조립 시작
        List<OrderDetailResponseDto> orderDetailResponseDtos= new ArrayList<>();

        for (int i = 0; i < requestDto.getOrderDetailsRq().size(); i++) {
            //저장할 레코드 orderDetail 선언 및 필요한 food 레코드를 불러오기
            OrderDetail orderDetail = new OrderDetail();
            Food food = foodRepository.findById(requestDto.getOrderDetailsRq().get(i).getFoodId()).orElseThrow(
                    () -> new NullPointerException("해당 음식이 존재하지 않습니다")
            );
            //orderDetail 조립 후 저장
            orderDetail.setOrderId(order.getId());
            orderDetail.setFoodId(food.getId());
            orderDetail.setQuantity(requestDto.getOrderDetailsRq().get(i).getQuantity());
            orderDetail.setPrice(food.getPrice() * requestDto.getOrderDetailsRq().get(i).getQuantity());
            orderDetailRepository.save(orderDetail);

            //orderDetailResponse 조립 시작
            OrderDetailResponseDto responseDto = new OrderDetailResponseDto();
            responseDto.setFoodName(food.getName());
            responseDto.setQuantity(requestDto.getOrderDetailsRq().get(i).getQuantity());
            responseDto.setPrice(food.getPrice() * requestDto.getOrderDetailsRq().get(i).getQuantity());

            //만들어진 orderDetailReponse를 리스트에 추가
            orderDetailResponseDtos.add(responseDto);
        }
        //최종 조립 및 orderResponseDto 반환
        return new OrderResponseDto(
                restaurant.getName(),
                orderDetailResponseDtos,
                restaurant.getDeliveryFee(),
                order.getTotalPrice()
        );
    }

    public List<OrderResponseDto> getOrders () {
        for (int i = 0; i < orderRepository.findAll().size(); i++) {

        } return null;
    }
}
