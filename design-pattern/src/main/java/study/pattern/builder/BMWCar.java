package study.pattern.builder;

import lombok.Data;

/**
 * 具体产品：宝马车
 */
@Data
public class BMWCar implements Car {

    /** 轮胎 */
    private String tyre;
    /** 发动机 */
    private String engine;
    /** 车体 */
    private String carBody;

}
