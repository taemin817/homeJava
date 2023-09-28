package Seller;

import java.util.ArrayList;

import Page.PageDAO;
import goods.Goods;

public class sellerService {
	
	sellerDAO dao = new sellerDAO();
	PageDAO pdao = new PageDAO();
	
	// 전체 조회
	public ArrayList<Goods> selectAll(){
		return dao.selectAll();
	}

	// 페이징을 겸한 전체 조회
	public ArrayList<Goods> getListPage(int page, int pageSize){
		return pdao.getListPage(page, pageSize);
	}
	
	// 추가(등록)
	public void RegisterGoods(Goods g) {
		dao.RegisterGoods(g);
	}
	
	// 수정
	public void alterGoods(Goods g) {
		dao.aleterGoods(g);
	}
	
	// 삭제
	public void deleteGoods (String goodsCode) {
		dao.deleteOne(goodsCode);
	}
	
	//민규
	public boolean RegisterGoods2(String goodsCode,int goodsBrand,String goodsName,int goodsPrice,int goodsStock) {
		return dao.RegisterGoods2(goodsCode, goodsBrand, goodsName, goodsPrice, goodsStock);
	}
	
	public boolean GoodsCodeCheck(String goodsCode ) {
		return dao.codeCheck(goodsCode);
	}
	

}
