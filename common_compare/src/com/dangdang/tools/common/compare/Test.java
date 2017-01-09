package com.dangdang.tools.common.compare;

import com.dangdang.tools.common.compare.json.JsonComparer;

public class Test {

	public static void main(String[] args) {
		IComparer comparer = new JsonComparer();
		String real = "{\"code\":0,\"msg\":\"�ɹ�\",\"subCode\":1002,\"subMsg\":null,\"elasped\":27,\"responseData\":{\"orderInfos\":[{\"order\":{\"orderId\":1412551801,\"parentId\":1412551801,\"orderType\":0,\"orderStatus\":-100,\"shopId\":0,\"shopType\":1,\"orderCreationDate\":\"2016-10-1111:59:12.000\",\"isMoveStore\":0,\"isJit\":0,\"moveStoreStatus\":0,\"jitSupplierId\":0,\"hasDeleted\":0,\"fromPlatform\":0,\"isPreSale\":1,\"preSaleArriveTime\":\"2016-10-1223:59:59.000\",\"promiseTime\":null,\"totalPrice\":39.0,\"shippingFee\":11.0,\"packingFee\":0.0,\"totalBarginPrice\":28.0,\"payableAmount\":39.0,\"paidAmount\":5.0,\"paymentMethodType\":1,\"isInstallment\":0,\"paymentProviderId\":4,\"shippingType\":5,\"preferredShippingTimeType\":0,\"receiverName\":\"��̫��\",\"receiverCountryId\":9000,\"receiverProvinceId\":111,\"receiverCityId\":1,\"receiverTownId\":1110101,\"receiverAddress\":\"������19��\",\"postCode\":\"100000\",\"receiverMobile\":\"\",\"receiverTel\":\"002\",\"warehouseId\":30,\"deliveryDate\":null,\"isGiftPackage\":0,\"pickUpId\":0,\"isComment\":1,\"orderAmounts\":[],\"energySaving\":null,\"repayId\":null,\"presaleInfo\":{\"presaleType\":2,\"orderPresaleStatus\":4,\"earnestMoney\":5.0,\"finalMoney\":23.0,\"presaleStartDate\":\"2016-10-1111:42:17.000\",\"presaleEndDate\":\"2016-10-0914:00:00.000\",\"payStartTime\":\"2016-10-1313:43:32.000\"},\"overseasTax\":null,\"cancelType\":200,\"isForciblySplitted\":0},\"products\":[{\"itemId\":1412551801001,\"orderQuantity\":1,\"allotQuantity\":null,\"dangPrice\":30.0,\"barginPrice\":28.0,\"salePrice\":30.0,\"warehouseId\":30,\"parentItemId\":0,\"relationType\":0,\"isComment\":1,\"productInfo\":{\"productId\":2055512,\"productName\":\"����ͼ��-2055512\",\"productVersion\":null,\"productType\":0,\"categoryPath\":null,\"medium\":0},\"reversedQuantity\":null,\"exchangeExpireDays\":303,\"refundExpireDays\":101343,\"isFreeShip\":0}]}]}}";
		String expect = "{\"code\":0,\"msg\":\"�ɹ�\",\"subCode\":null,\"subMsg\":null,\"elasped\":29,\"responseData\":{\"orderInfos\":[{\"order\":{\"orderId\":1412551801,\"parentId\":1412551801,\"orderType\":0,\"orderStatus\":-100,\"shopId\":0,\"shopType\":1,\"orderCreationDate\":\"2016-10-1111:59:12.000\",\"isMoveStore\":0,\"isJit\":0,\"moveStoreStatus\":0,\"jitSupplierId\":0,\"hasDeleted\":0,\"fromPlatform\":0,\"isPreSale\":1,\"preSaleArriveTime\":\"2016-10-1223:59:59.000\",\"promiseTime\":null,\"totalPrice\":39.00,\"shippingFee\":11.00,\"packingFee\":0.00,\"totalBarginPrice\":28.00,\"payableAmount\":39.00,\"paidAmount\":5.00,\"paymentMethodType\":1,\"isInstallment\":0,\"paymentProviderId\":4,\"shippingType\":5,\"preferredShippingTimeType\":0,\"receiverName\":\"��̫��\",\"receiverCountryId\":9000,\"receiverProvinceId\":111,\"receiverCityId\":1,\"receiverTownId\":1110101,\"receiverAddress\":\"������18��\",\"postCode\":\"100000\",\"receiverMobile\":\"\",\"receiverTel\":\"002\",\"warehouseId\":30,\"deliveryDate\":null,\"isGiftPackage\":0,\"pickUpId\":0,\"isComment\":1,\"orderAmounts\":[],\"energySaving\":null,\"repayId\":null,\"presaleInfo\":{\"presaleType\":2,\"orderPresaleStatus\":4,\"earnestMoney\":5.00,\"finalMoney\":23.00,\"presaleStartDate\":\"2016-10-1111:42:17.000\",\"presaleEndDate\":\"2016-10-0914:00:00.000\",\"payStartTime\":\"2016-10-1313:43:32.000\"},\"overseasTax\":null,\"cancelType\":200,\"isForciblySplitted\":0},\"products\":[{\"itemId\":1412551801001,\"orderQuantity\":1,\"allotQuantity\":null,\"dangPrice\":30.00,\"barginPrice\":28.00,\"salePrice\":30.00,\"warehouseId\":30,\"parentItemId\":0,\"relationType\":0,\"isComment\":1,\"productInfo\":{\"productId\":2055512,\"productName\":\"����ͼ��-2055512\",\"productVersion\":null,\"productType\":0,\"categoryPath\":null,\"medium\":0},\"reversedQuantity\":null,\"exchangeExpireDays\":303,\"refundExpireDays\":101343,\"isFreeShip\":0}]}]}}";
		try {
			System.out.println(comparer.compare(expect, real));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}