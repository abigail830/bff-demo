package com.github.abigail830.bff.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.abigail830.bff.dto.MethodInfoList;
import com.github.abigail830.bff.util.HttpClientUtil;
import com.github.abigail830.bff.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class QueryResolver implements GraphQLQueryResolver {

    private static final String BASE_URL = "http://ec2-68-79-38-105.cn-northwest-1.compute.amazonaws.com.cn:18083";

    public MethodInfoList getEmptyTest(Integer systemId, Integer numberPerPage, Integer currentPageNumber) {
        String queryURL = BASE_URL +
                "/systems/SYSTEM_ID/test-bad-smell/empty-test-methods" +
                "?numberPerPage=NUM_PER_PAGE&currentPageNumber=CUR_PAGE_NUM";
        final String updatedURL = queryURL
                .replace("SYSTEM_ID", systemId.toString())
                .replace("NUM_PER_PAGE", numberPerPage.toString())
                .replace("CUR_PAGE_NUM", currentPageNumber.toString());

        final String responseJson = HttpClientUtil.instance().getData(updatedURL);
        log.info("{}", responseJson);
        return JsonUtil.toObject(responseJson, MethodInfoList.class);
    }
}
