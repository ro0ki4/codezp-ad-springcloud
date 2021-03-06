package club.constant;

import lombok.Getter;

/**
 * @Author:Zpg
 * @Date:2020/8/1 22:16
 * @Version:1.0
 * @Description:
 */
@Getter
public enum  CreativeMetrialType {
    JPG(1,"JPG"),
    BMP(2,"bmp"),

    MP4(3,"mp4"),
    AVI(4,"avi"),

    TXT(5,"txt");

    private int type;
    private String desc;

    CreativeMetrialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
