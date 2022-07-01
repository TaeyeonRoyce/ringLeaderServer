package umc.spring.ringleader.config;

import lombok.Getter;

@Getter
public enum BaseResponseStatus {
    /**
     * 1000 : 요청성공

     */
    SUCCESS(true,1000,"요청에 성공하였습니다.");

    /**
     * 2000 : User관련 오류
     */
    //Common


    /**
     * 3000 : Review관련 오류
     */


    /**
     * 5000 : Region관련 오류
     */


    /**
     * 6000 : Database, Server 오류
     */





    private final boolean isSuccess;

    private final int code;
    private final String message;
    
    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
