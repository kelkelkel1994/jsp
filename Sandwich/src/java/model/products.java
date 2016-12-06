
package model;


public class products {
    private Long IDsp;
    private Long IDct;
    private String Ten;
    private Integer Gia;
    private Integer Giakm;
    private String Motangan;
    private String Mota;
    private String Anhbia;
    private String Anh1;
    private String Anh2;
    private Boolean TTkm;
    private Boolean TThot;
    private Boolean TTtop;
    private Boolean TTnew;
    private Boolean TTtopweek;
    private Boolean Trangthai;
    
    public products(){}

    public products(Long IDsp, Long IDct, String Ten, Integer Gia, Integer Giakm, String Motangan, String Mota, String Anhbia, String Anh1, String Anh2, Boolean TTkm, Boolean TThot, Boolean TTtop, Boolean TTnew, Boolean TTtopweek, Boolean Trangthai) {
        this.IDsp = IDsp;
        this.IDct = IDct;
        this.Ten = Ten;
        this.Gia = Gia;
        this.Giakm = Giakm;
        this.Motangan = Motangan;
        this.Mota = Mota;
        this.Anhbia = Anhbia;
        this.Anh1 = Anh1;
        this.Anh2 = Anh2;
        this.TTkm = TTkm;
        this.TThot = TThot;
        this.TTtop = TTtop;
        this.TTnew = TTnew;
        this.TTtopweek = TTtopweek;
        this.Trangthai = Trangthai;
    }

    public Long getIDsp() {
        return IDsp;
    }

    public void setIDsp(Long IDsp) {
        this.IDsp = IDsp;
    }

    public Long getIDct() {
        return IDct;
    }

    public void setIDct(Long IDct) {
        this.IDct = IDct;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Integer getGia() {
        return Gia;
    }

    public void setGia(Integer Gia) {
        this.Gia = Gia;
    }

    public Integer getGiakm() {
        return Giakm;
    }

    public void setGiakm(Integer Giakm) {
        this.Giakm = Giakm;
    }

    public String getMotangan() {
        return Motangan;
    }

    public void setMotangan(String Motangan) {
        this.Motangan = Motangan;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getAnhbia() {
        return Anhbia;
    }

    public void setAnhbia(String Anhbia) {
        this.Anhbia = Anhbia;
    }

    public String getAnh1() {
        return Anh1;
    }

    public void setAnh1(String Anh1) {
        this.Anh1 = Anh1;
    }

    public String getAnh2() {
        return Anh2;
    }

    public void setAnh2(String Anh2) {
        this.Anh2 = Anh2;
    }

    public Boolean getTTkm() {
        return TTkm;
    }

    public void setTTkm(Boolean TTkm) {
        this.TTkm = TTkm;
    }

    public Boolean getTThot() {
        return TThot;
    }

    public void setTThot(Boolean TThot) {
        this.TThot = TThot;
    }

    public Boolean getTTtop() {
        return TTtop;
    }

    public void setTTtop(Boolean TTtop) {
        this.TTtop = TTtop;
    }

    public Boolean getTTnew() {
        return TTnew;
    }

    public void setTTnew(Boolean TTnew) {
        this.TTnew = TTnew;
    }

    public Boolean getTTtopweek() {
        return TTtopweek;
    }

    public void setTTtopweek(Boolean TTtopweek) {
        this.TTtopweek = TTtopweek;
    }

    public Boolean getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(Boolean Trangthai) {
        this.Trangthai = Trangthai;
    }
    

    
}
