package com.shasha.msksmanufacturer.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChocolateDtoV2 {

    @NotNull
    private UUID id;

    @NotBlank
    private String chocolateName;

    @NotBlank
    private String chocolateSlogan;

    @NotNull
    private ChocolateType chocolateType;

    @Positive
    private Long upc;

}
