package com.hoangtien2k3qx1.favouriteservice.domain;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.hoangtien2k3qx1.favouriteservice.constant.AppConstant;
import com.hoangtien2k3qx1.favouriteservice.domain.id.FavouriteId;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.Builder;

@Builder
@Entity
@Table(name = "favourites")
@IdClass(FavouriteId.class) // Id Favourite
public record Favourite(
        @Id
        @Column(name = "user_id", nullable = false)
        Integer userId,
        @Id
        @Column(name = "product_id", nullable = false)
        Integer productId,
        @Id
        @Column(name = "like_date", nullable = false)
        @JsonSerialize(using = LocalDateTimeSerializer.class)
        @JsonDeserialize(using = LocalDateTimeDeserializer.class)
        @JsonFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT, shape = Shape.STRING)
        @DateTimeFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT)
        LocalDateTime likeDate
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
