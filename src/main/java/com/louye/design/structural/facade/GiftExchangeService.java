package com.louye.design.structural.facade;

/**
 * @Auther: louye
 * @Date: 2021/1/6 15:43
 * @Description:
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift) {
        if (qualifyService.isAvailable(pointGift)){
            if (pointsPaymentService.pay(pointGift)) {
                String orderNum = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功, 订单号为: " + orderNum);
            }
        }
    }
}
