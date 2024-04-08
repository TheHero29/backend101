package dev.loukik.backend.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String Title;
    private String Description;
    private String Image;
    private String Category;
}
