package com.shop.dto;

import com.shop.entity.ItemImg;
import org.modelmapper.ModelMapper;

public class ItemImgDto {

    private Long id;
    private String imgName;
    private String oriImgName;
    private String imgUrl;
    private String repImgYn;

    private static ModelMapper modelMapper = new ModelMapper();

    // Entity -> DTO
    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg, ItemImgDto.class);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getOriImgName() {
        return oriImgName;
    }

    public void setOriImgName(String oriImgName) {
        this.oriImgName = oriImgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRepImgYn() {
        return repImgYn;
    }

    public void setRepImgYn(String repImgYn) {
        this.repImgYn = repImgYn;
    }

    public static ModelMapper getModelMapper() {
        return modelMapper;
    }

    public static void setModelMapper(ModelMapper modelMapper) {
        ItemImgDto.modelMapper = modelMapper;
    }

    // DTO -> Entity 없는 이유는 regImgYn 값을 직접 설정해서 변환해야함

}
