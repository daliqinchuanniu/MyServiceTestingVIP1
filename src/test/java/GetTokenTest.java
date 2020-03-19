import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Copyright (C), 2017-2020
 * Author: 邵振
 * Date: 2020/3/19 3:52 下午
 * FileName: GetTokenTest
 * Description: test
 */
public class GetTokenTest {

    @Test
    public void getToken(){
        given().
                queryParam("corpid","ww8b2500a37e3a7e4d").
                queryParam("corpsecret","Uj6Mai4rxYIFfhOYzrQBKilzRCZHRpZ63XMthAHjEFc").
        when().get("https://qyapi.weixin.qq.com/cgi-bin/gettoken").
        then().statusCode(200).body("errcode",equalTo(0));
    }
}
