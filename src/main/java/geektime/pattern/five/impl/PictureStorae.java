package geektime.pattern.five.impl;

import geektime.pattern.five.IPictureStorage;
import geektime.pattern.five.Picture;
import geektime.pattern.five.PictureMetaInfo;

import java.awt.*;

public class PictureStorae implements IPictureStorage {
    @Override
    public void savePicture(Picture picture) {

        
    }

    @Override
    public Image getPicture(String pictureId) {
        return null;
    }

    @Override
    public void deletePicture(String pictureId) {

    }

    @Override
    public void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo) {

    }
}
