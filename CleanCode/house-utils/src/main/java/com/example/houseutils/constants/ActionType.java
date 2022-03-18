package com.example.houseutils.constants;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum ActionType {
    PURCHASE("매매"),
    RENT("임대차");

    private String description;
}
