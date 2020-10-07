package com.github.abigail830.bff.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MethodInfoList {

    Long count;
    Long currentPageNumber;
    List<MethodInfo> data;
}
