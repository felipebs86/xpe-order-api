package com.bahiense.xpe.openCommerceAPI.repository

import com.bahiense.xpe.openCommerceAPI.model.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository<Order, Long>