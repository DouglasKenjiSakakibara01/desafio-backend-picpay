package com.picpaysimplificado.picpaysimplificado.dto;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, long receiverId){

}
