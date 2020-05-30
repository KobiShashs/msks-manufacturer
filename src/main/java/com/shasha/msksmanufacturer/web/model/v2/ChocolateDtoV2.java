package com.shasha.msksmanufacturer.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChocolateDtoV2 {

    private UUID id;
    private String chocolateName;
    private String chocolateSlogan;
    private ChocolateType chocolateType;
    private Long upc;

}
