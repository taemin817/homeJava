package Seller;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import Page.PageDAO;
import goods.Goods;


public class sellerService2 {

	sellerDAO dao = new sellerDAO();
	PageDAO pdao = new PageDAO();
	
	//-----------------------------------------------------------------------------------------
	// 전체 조회
	public ArrayList<Goods> selectAll(){
		return dao.selectAll();
	}
	
	//-----------------------------------------------------------------------------------------
	// 전체 조회(json)
	/*
	public JSONArray selectAll() {
		ArrayList<Seller.Goods> goodsList = dao.selectAll();
		JSONArray arr = new JSONArray();

		for (int i = 0; i < goodsList.size(); i++) {
			Seller.Goods g = goodsList.get(i);
			JSONObject o = new JSONObject();
			o.put("goodsCode", g.getGoodsCode());
			o.put("goodsBrnad", g.getGoodsBrand());
			o.put("goodsName", g.getGoodsName());
			o.put("goodsPrice", g.getGoodsPrice());
			o.put("goodsStock", g.getGoodsStock());
			arr.put(o);
		}
		return arr;
	}*/

	
	//-----------------------------------------------------------------------------------------
	// 페이징을 겸한 json 전체 조회
	public JSONArray getListPage(int currentPage, int pageSize) {

		ArrayList<Goods> list = pdao.getListPage(currentPage, pageSize);
		JSONArray arr = new JSONArray();

		for (int i = 0; i < list.size(); i++) {
			Goods g = list.get(i);
			JSONObject o = new JSONObject();
			o.put("num", g.getNum());
			o.put("goodsCode", g.getGoodsCode());
			o.put("goodsBrand", g.getGoodsBrand());
			o.put("goodsName", g.getGoodsName());
			o.put("goodsPrice", g.getGoodsPrice());
			o.put("goodsStock", g.getGoodsStock());
			arr.put(o);

		}
		return arr;
	}
	

	//-----------------------------------------------------------------------------------------
	// 추가(등록)
	public void RegisterGoods(Goods g) {
		dao.RegisterGoods(g);
	}

	//-----------------------------------------------------------------------------------------
	// 빈칸을 등록했을 때 메서드
	public boolean RegisterGoods2(String goodsCode, int goodsBrand, String goodsName, int goodsPrice, int goodsStock) {
		return dao.RegisterGoods2(goodsCode, goodsBrand, goodsName, goodsPrice, goodsStock);
	}

	//-----------------------------------------------------------------------------------------
	// goodsCode 중복확인
	public boolean GoodsCodeCheck(String goodsCode) {
		return dao.codeCheck(goodsCode);
	}

	//-----------------------------------------------------------------------------------------
	// 수정
	public void alterGoods(Goods g) {
		dao.aleterGoods(g);
	}

	//-----------------------------------------------------------------------------------------
	// 삭제
	public void deleteGoods(String goodsCode) {
		dao.deleteOne(goodsCode);
	}

	public static void main(String[] args) {
		sellerService2 s = new sellerService2();
									// 현재페이지, 페이지에 보일 내용의 갯수
		JSONArray result = s.getListPage(2, 3);
		for (Object goods : result) {
			System.out.println(goods);
		}
	}

}
