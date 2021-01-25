package com.louye.design.strategy;

/**
 * @Auther: louye
 * @Date: 2021/1/25 11:02
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new LiJianPromotionStrategy());
        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();

    }


//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "LIJIAN";
//        if (promotionKey.equals("LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        }else if (promotionKey.equals("MANJIAN")){
//            promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
//        }
//        promotionActivity.executePromotionStrategy();
//    }


//    public static void main(String[] args) {
//        String promotionKey = "MANJIAN";
//        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
//        promotionActivity.executePromotionStrategy();
//    }
}
