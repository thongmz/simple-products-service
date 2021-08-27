package com.fleta.productsservice.domain.dto;


import com.fleta.productsservice.grpc.ContentsExpired;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContentsDto {
    private String	contents_id;
    private String	expired_date;


    public ContentsExpired toContentsExpired() {
        return ContentsExpired.newBuilder()
                .setContentsId(this.getContents_id())
                .setExpiredDate(this.getExpired_date())
                .build();
    }

    public static ContentsDto buildFromContentsExpired(ContentsExpired contentsExpired) {
        return new ContentsDto(
                contentsExpired.getContentsId(),
                contentsExpired.getExpiredDate());
    }
}
