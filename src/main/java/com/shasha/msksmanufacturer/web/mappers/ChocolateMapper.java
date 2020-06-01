package com.shasha.msksmanufacturer.web.mappers;

import com.shasha.msksmanufacturer.domain.Chocolate;
import com.shasha.msksmanufacturer.web.model.v2.ChocolateDtoV2;
import org.mapstruct.Mapper;

/**
 * Created by kobis on 31 May, 2020
 */
@Mapper(uses = DateMapper.class)
public interface ChocolateMapper {

    ChocolateDtoV2 chocolateToChocolateDto(Chocolate chocolate);

    Chocolate chocolateDtoTohChocolate(ChocolateDtoV2 dto);
}
