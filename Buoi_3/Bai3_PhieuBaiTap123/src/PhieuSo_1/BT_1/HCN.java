package PhieuSo_1.BT_1;

public class HCN {

    private float dai, rong;

    public float chuVi() {
        return 2 * (dai + rong);
    }

    public float dienTich() {
        return dai * rong;
    }

    public HCN() {
    }

    public HCN(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
}
