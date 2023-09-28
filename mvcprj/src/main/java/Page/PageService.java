package Page;


public class PageService {
	
	PageDAO dao = new PageDAO();
	
	public int getTotalCnt() {
		return dao.getTotalCnt();
	}
	
}
