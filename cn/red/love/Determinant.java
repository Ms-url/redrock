package cn.red.love;

public interface Determinant {
    void Showfinallyanswer(double[][] determinant);
    void DeterminantGet();//完整功能接口 单接口完成完整功能
    void DeterminantPaste(double [][]determinant,double longth);
    double MathDeterminantCalculation(double[][] value) throws Exception;
    double MathValue(double[][] value, double result) throws Exception;
    double[] AddValue(double[] currentRow,double[] frontRow, double ratio) throws Exception;
    double[][] ChangeDeterminantNoZero(double[][] determinant,int line,int row) throws Exception;

}
