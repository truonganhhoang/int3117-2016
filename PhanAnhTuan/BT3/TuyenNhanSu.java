public class TuyenNhanSu {

    /**
     * @param args the command line arguments
     */
    public int soLuongNhanSuTuyen(NhanSu[] nhansu){
        int dem=0;
        if(nhansu == null){
            return dem;
        }
        for(int i=0;i<nhansu.length;i++){
            if((nhansu[i].soNamKinhNghiem < 0 || nhansu[i].diemTrungBinh < 0.0)){
                continue;
            }
            if(nhansu[i].diemTrungBinh >= 3.0){
                dem++;
                continue;
            }
            if((nhansu[i].soNamKinhNghiem >= 2 && nhansu[i].diemTrungBinh >= 2.0)
                    ||(nhansu[i].soNamKinhNghiem < 2 && nhansu[i].diemTrungBinh >= 2.5)){
                dem++;
            }
        }
        return dem;
    }
}


