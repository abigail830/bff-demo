package com.github.abigail830.bff.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MethodInfo {
    String id;
    Long systemId;
    String methodName;
    String moduleName;
    String packageName;
    String typeName;
}
