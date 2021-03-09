package Framework.Api;

public class DataClass {

    public static Object[][] cepvalido(){
        return new Object[][]{{"01001000"}};
    }

    public static Object[][] cepinexistente(){
        return new Object[][]{{"99999999","00000000"}};
    }

    public static Object[][] cepcomformatoinvalido(){
        return new Object[][]{{"999999xx","AA12AA89AA","?//**&&987"}};
    }

}
