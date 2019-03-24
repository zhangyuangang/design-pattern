package study.pattern.builder;

/**
 * 汽车制造器接口
 */
public interface CarBuilder {

    /**
     * 生产轮胎
     */
    void buildTyre();

    /**
     * 生产发动机
     */
    void buildEngine();

    /**
     * 生产车体
     */
    void buildCarBody();

    /**
     * 获取汽车
     */
    Car getCar();

}
