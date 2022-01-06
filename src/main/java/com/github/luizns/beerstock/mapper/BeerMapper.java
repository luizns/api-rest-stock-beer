package com.github.luizns.beerstock.mapper;

import com.github.luizns.beerstock.dto.BeerDTO;
import com.github.luizns.beerstock.entity.Beer;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface BeerMapper {

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}