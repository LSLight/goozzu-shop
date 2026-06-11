package io.github.lslight.goozzu.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // Common
    INVALID_INPUT(HttpStatus.BAD_REQUEST, "잘못된 입력입니다"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "인증이 필요합니다"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "접근 권한이 없습니다"),

    // User
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다"),
    DUPLICATE_EMAIL(HttpStatus.CONFLICT, "이미 사용 중인 이메일입니다"),

    // Product
    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "상품을 찾을 수 없습니다"),

    // Order
    ORDER_NOT_FOUND(HttpStatus.NOT_FOUND, "주문을 찾을 수 없습니다"),
    ORDER_ALREADY_PAID(HttpStatus.CONFLICT, "이미 결제된 주문입니다"),

    // Payment
    PAYMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "결제 정보를 찾을 수 없습니다"),
    PAYMENT_FAILED(HttpStatus.BAD_REQUEST, "결제에 실패했습니다"),
    PAYMENT_AMOUNT_MISMATCH(HttpStatus.BAD_REQUEST, "결제 금액이 일치하지 않습니다"),

    // Download
    DOWNLOAD_NOT_FOUND(HttpStatus.NOT_FOUND, "다운로드 정보를 찾을 수 없습니다"),
    DOWNLOAD_EXPIRED(HttpStatus.GONE, "다운로드 링크가 만료되었습니다"),
    DOWNLOAD_LIMIT_EXCEEDED(HttpStatus.FORBIDDEN, "다운로드 횟수를 초과했습니다");

    private final HttpStatus status;
    private final String message;
}
