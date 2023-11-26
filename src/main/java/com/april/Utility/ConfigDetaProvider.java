package com.april.Utility;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigDetaProvider {
	Properties pro;
	public ConfigDetaProvider() throws IOException {
		String configpath = "C:\\Users\\admin\\eclipse-workspace\\FrameWork\\Config.properties\\file";
		FileInputStream file = new FileInputStream(configpath);
		pro = new Properties();
		pro.load(file);

	}
	public String getStageUrl() {
		return pro.getProperty("StageUrl");
	}
	public String getHomePageTitle() {
		return pro.getProperty("HomePageTitle");	
	}
	public String getMobileMenu_Name() {
		return pro.getProperty("MobileMenu_Name");	
	}
	public String getMobilePageTitle() {
		return pro.getProperty("MobilePageTitle");	
	}
	public String getNameForMobilePageDropDown() {
		return pro.getProperty("MobilePageDropDownName");	
	}
	public String getMobilePageDropDown_Name() {
		return pro.getProperty("MobilePageDropDown_Name");	
	}
	public String getMobilesPageDropDownName() {
		return pro.getProperty("MobilesPageNameDropDown");	
	}
	public String getSonyExperiaAddtoCart() {
		return pro.getProperty("SonyExperiaAddtoCart");	
	}
	public String getQtyInputBox() {
		return pro.getProperty("QtyInputBox");	
	}
	public String getThousand() {
		return pro.getProperty("Thousand");	
	}
	public String getUpdateButton() {
		return pro.getProperty("UpdateButton");	
	}
	public String getSonyExperiaPrice() {
		return pro.getProperty("SonyExperiaPrice");	
	}
	public String getSonyExperia() {
		return pro.getProperty("SonyExperia");	
	}
	public String getErrorMessage(){
		return pro.getProperty("errorMessage");	
	}
	public String getErrorMessageBody(){
		return pro.getProperty("ErrorMessage");	
	}
	public String getCart(){
		return pro.getProperty("CartEmpty");	
	}
	public String getEmptyCart(){
		return pro.getProperty("EmptyCartMessage");	
	}
	public String getEmptyCartMessageExp(){
		return pro.getProperty("EmptyCartMessageExpected");	
	}
	public String getSamsungGalexyAddtoCompare(){
		return pro.getProperty("one");	
	}
	public String getSonyExperiaAddtoCompare(){
		return pro.getProperty("two");	
	}
	public String getCompare(){
		return pro.getProperty("compare");	
	}
	public String getExpTitle(){
		return pro.getProperty("expTitle");	//
	}
	public String getMobileNamesinCompare(){
		return pro.getProperty("comparemobile");	
	}
	public String getMyAccount(){
		return pro.getProperty("myaccount");	
	}
	public String getCreateAccountButton(){
		return pro.getProperty("createaccount");	
	}
	public String getFirstname(){
		return pro.getProperty("firstname");	
	}
	public String getLastname(){
		return pro.getProperty("lastname");	
	}
	public String getEmail(){
		return pro.getProperty("email");	
	}
	public String getPassword(){
		return pro.getProperty("pass");	
	}
	public String getComfPass(){
		return pro.getProperty("comfpass");	
	}
	public String getRegister(){
		return pro.getProperty("regi");	
	}
	public String getComfirmMessage(){
		return pro.getProperty("comfirmMessage");	
	}
	public String getExpText(){
		return pro.getProperty("expMessage");	
	}
	public String getTV(){
		return pro.getProperty("tv");	
	}
	public String getAddtowishlist(){
		return pro.getProperty("addtowl");	
	}
	public String getShareWishList(){
		return pro.getProperty("sharewl");	
	}
	public String getEmailforShare(){
		return pro.getProperty("emailforshare");	
	}
	public String getShareWishListButton(){
		return pro.getProperty("shareWLButton");	
	}
	public String getShareWLComfirmMessage(){
		return pro.getProperty("sharewlcomfmessage");	
	}
	public String getExpMessageText(){
		return pro.getProperty("sharewlcomfmessageExp");	
	}
	public String getWishList(){
		return pro.getProperty("wishlist");	
	}
	public String getAddtoCart(){
		return pro.getProperty("addtocart");	
	}
	public String getProccedtoCheckout(){
		return pro.getProperty("toChechout");	
	}
	public String getAddress(){
		return pro.getProperty("address");	
	}
	public String getCity(){
		return pro.getProperty("cityforbilling");	
	}
	public String getContry(){
		return pro.getProperty("country");	
	}
	public String getState(){
		return pro.getProperty("state");	
	}
	public String getZip(){
		return pro.getProperty("zip");	
	}
	public String getTelePhone(){
		return pro.getProperty("tele");	
	}
	public String getContinue(){
		return pro.getProperty("continue");	
	}
	public String getShippingPrice(){
		return pro.getProperty("shippingprice");	
	}
	public String getExpectedShippingPrice(){
		return pro.getProperty("expectedShippingprice");	
	}
	public String getCheckorMoneyOrderradioButton(){
		return pro.getProperty("checkmoney");	
	}
	public String getActvalue(){
		return pro.getProperty("actvalue");	
	}
	public String getExpectedValue(){
		return pro.getProperty("expevalue");	
	}
	public String getPlaceOrder(){
		return pro.getProperty("placeOrder");	
	}
	public String getActualMessage(){
		return pro.getProperty("actumessage");	
	}
	public String getExpectedMessage(){
		return pro.getProperty("expemessage");	
	}
	public String getLoginButton(){              //not at desired location
		return pro.getProperty("loginButton");	
	}
	public String getMyOrders(){
		return pro.getProperty("myorders");	
	}
	public String getViewOrder(){
		return pro.getProperty("vieworder");	
	}
	public String getOrderTextActual(){
		return pro.getProperty("actuOrder");	
	}
	public String getPrintOrder(){
		return pro.getProperty("printorder");	
	}
	public String getReOrder(){
		return pro.getProperty("reorder");	
	}
	public String getQuantity(){
		return pro.getProperty("quantity");	
	}
	public String getIPhoneAddtoCart(){
		return pro.getProperty("iphoneaddtocart");	
	}
	public String getDiscount(){
		return pro.getProperty("discountcoupon");	
	}
	public String getCoupon(){
		return pro.getProperty("discoupon");	
	}
	public String getApply(){
		return pro.getProperty("apply");	
	}
	public String getDiscountedPrice(){
		return pro.getProperty("discountedPrice");	
	}
}
