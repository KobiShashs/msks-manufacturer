package com.shasha.msksmanufacturer.domain;

import com.shasha.msksmanufacturer.web.model.v2.ChocolateType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by kobis on 31 May, 2020
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Chocolate {

    private UUID id;
    private String chocolateName;
    private String chocolateSlogan;
    private ChocolateType chocolateType;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;


}
