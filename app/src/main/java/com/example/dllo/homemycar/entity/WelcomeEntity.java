package com.example.dllo.homemycar.entity; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

/**
 * Created by dllo on 16/10/13.
 */
public class WelcomeEntity {

    /**
     * returncode : 0
     * message :
     * result : {"ishavead":1,"pvid":"a0069a06-03ec-4c9a-83d7-be0362f0741a0","rdposturl":"http://rd.autohome.com.cn/adfront/realdeliver?pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0","areaid":19637,"ad":{"imgad":{"imgurl":"http://f1.p0y.cn/c/862/789342.jpg","openurl":"http://adx.autohome.com.cn/c?z=26&la=1047&bidid=2084633c-6dcb-43a0-b42e-546cce7d535d&pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0&dvid=021676cd548e5cf2b6149c916a767228fac74da0&u=PNJ%2BSyFzH/XQZI7K08EYJhFoS6y5kBGcxJcYpcyjZiEhVs0Av2FPblFwJZJc7I3FLEVaRyK%2BgEVUa1ufml6HluyyjaAIZlLeSU59oOJnsjMAtNkHZKVogMCYMSF8RRBLI%2Bni%2BMoKNSQo1F1MZ3LMot%2BJNQBSkhPGZSqicaZsEYsXpUMB/J45wBC71zg21HieQGz7/PQFvVMLsw0YmO4L/MSZg5Ab0lxvUf1q3vrVrAILJNQx98Zf1rlU8fI9DNeSMU93y4f1CRhVvAD/9nvj81Ero8qFejaeaPeM%2BtefYx/CjOxuDq7r1ZCLf2wMwo/WtcUar75p6ab9OOM5NE0AgUkd4AL/6DBirrqASO7EZ3unx1yTahPxr9QPWtDB4WOJQk8OKm%2BnF30FMvKB6jqJcJ4LMxuYA4mxSmjubeNi013LgtzpM47G/m7x5nWKyO6OM4bzgqw13spNhFdtuWrp4alfhmIec3rrdIXHcdbOX3wCEc4D7nFrddpQk5PxDiYeDQln7/rzFNtj9Jau1WFTiwAfO/P40nEKhc9m5OsK6rH74LVhqqbQtH31AlRypUim2PaKe9gLGwp8TKDYcI9IxPi/yLOa1icVLSIyMM4k47HQrix0KTI3Bwu3xZH5DO4cZquTJZ7FqvsPUuyGRq5kNlGVWCbaHNyEOHOE0v/xM7aOWpC3YLOJ66YdGF1ox5R30evhzHcsrGXte9oraJgv9R7C9LDyrOll2Bha%2BZLNsyYLrNhkFjr3ZFLj6Fs6AQDQAR7hSQrkhWIajQ%2BNNEBKA3j9SQ0EC6dLGvZtBj0Xumtkb9PkFp0oRFefurBJqbBjjlFJR46XaqLSFtNwEGAjihIPhRFdtSW1IzGqhOYrqWChpCmSM3kJ/ceJWebZg9HPs7Eo0i%2BA7Orp1Vc5/9xD9w7JKhoyf1ylOS2qLnEUBy%2BQW5fNcaniIekKKQ0T3cwjDobaWZzSzYRI24o4Khk2DinRQGs30G9n3/vMHEcjORIHaqMU1pjhlhWYj5sthUQMDx9Ins3rzG40WMGa3cv64cuh4Cdxc4Ehwm/1CAI3d79RKcIPnVUxLq8gni8rEilDPzkiyNPfmMc%2B7AW2eLIKVZNwN7ujECGSKQKZaUOFN6iudCZrV/EH1FVUFkGSAGtK8Z0JjjFrkF2XGMJQFIaR0YIwhvKPSahElc5VPmNY6EaKzcXIK0cgfdQ8KjD0YPCVwhFwa5LIHYdkluZT3EY428JFFudnrCHxoP5zdA5qQV3XAHEpswzhlAuKs1HPOkntdG9V1ZXmkRdqIKxYQZnr8CQWMOQjTaKDeduulvfFIWikJVh%2Bc26oHApOwQNcCiGh"},"gifad":{"imgurl":"","openurl":""},"showtime":3,"skipbtn":1,"expiretime":"2016-10-20","splashid":19637,"materialid":"393975","thirdadurl":"http%3A%2F%2Fadx.autohome.com.cn%2Fe%3Fz%3D26%26la%3D1047%26bidid%3D2084633c-6dcb-43a0-b42e-546cce7d535d%26pvid%3Da0069a06-03ec-4c9a-83d7-be0362f0741a0%26dvid%3D021676cd548e5cf2b6149c916a767228fac74da0%26bp%3D416%26wp%3D416,http%3A%2F%2Fstats.ipinyou.com%2Fqczj%2Ft.gif%3Fp%3DrSBgZFfLWnA5.6gfxVAlRO9Lr3mqbJmzKQpkKMNBTJsb6UYb3y5m60qRQrQsd.dFq8IM5.DS5jtA2SL6kh3MlhtYFrUrcH-vS90sED7hz5-D85WNc.DS5jtA2SL6kh3MlhtYFrUrcH-vS90sED7hz5-D85WNc.R.hM81TyXraw.QA.f.I.f.6.I.dPKzCwxpPemcXm5meYCpGDR6-ecVwmm_UhxA-5SHW6TVRI2j4Os16_*P1xcqx98MvmDtZBiegm0GxcAXyj20sED7huh-xblYNcGhMEFyFSP6pno_Nf.W.6OfSV0.QH.IP.MLs.mWn.EkZ.hb6h.NOAq.lcfz.Df.W.W.IsnMhK.VFFxt5L.5F1RQup0Bx17XgaI.QK.ubqJEYc.R6%26s%3D2HdP_pD8Vem8Qz1-duE1mX%26w%3D416,https%3A%2F%2Fstats.ipinyou.com%2Fstats%2Ft.gif%3Ftpp%3Dcfcd208495d565ef66e7dff9f98764da%26p%3DQWfsh_CLIin5.v_.Rh.WC.dxz.4ji.Wwg.gVEZ.8aVh.W.p%26s%3D5hdX4iDjKTRNA91vtXMMF0%26w%3DCKFlJmKiInTapBlBUKAbycrEp0ujz1PvBraXw_"}}
     */

    private int returncode;
    private String message;
    /**
     * ishavead : 1
     * pvid : a0069a06-03ec-4c9a-83d7-be0362f0741a0
     * rdposturl : http://rd.autohome.com.cn/adfront/realdeliver?pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0
     * areaid : 19637
     * ad : {"imgad":{"imgurl":"http://f1.p0y.cn/c/862/789342.jpg","openurl":"http://adx.autohome.com.cn/c?z=26&la=1047&bidid=2084633c-6dcb-43a0-b42e-546cce7d535d&pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0&dvid=021676cd548e5cf2b6149c916a767228fac74da0&u=PNJ%2BSyFzH/XQZI7K08EYJhFoS6y5kBGcxJcYpcyjZiEhVs0Av2FPblFwJZJc7I3FLEVaRyK%2BgEVUa1ufml6HluyyjaAIZlLeSU59oOJnsjMAtNkHZKVogMCYMSF8RRBLI%2Bni%2BMoKNSQo1F1MZ3LMot%2BJNQBSkhPGZSqicaZsEYsXpUMB/J45wBC71zg21HieQGz7/PQFvVMLsw0YmO4L/MSZg5Ab0lxvUf1q3vrVrAILJNQx98Zf1rlU8fI9DNeSMU93y4f1CRhVvAD/9nvj81Ero8qFejaeaPeM%2BtefYx/CjOxuDq7r1ZCLf2wMwo/WtcUar75p6ab9OOM5NE0AgUkd4AL/6DBirrqASO7EZ3unx1yTahPxr9QPWtDB4WOJQk8OKm%2BnF30FMvKB6jqJcJ4LMxuYA4mxSmjubeNi013LgtzpM47G/m7x5nWKyO6OM4bzgqw13spNhFdtuWrp4alfhmIec3rrdIXHcdbOX3wCEc4D7nFrddpQk5PxDiYeDQln7/rzFNtj9Jau1WFTiwAfO/P40nEKhc9m5OsK6rH74LVhqqbQtH31AlRypUim2PaKe9gLGwp8TKDYcI9IxPi/yLOa1icVLSIyMM4k47HQrix0KTI3Bwu3xZH5DO4cZquTJZ7FqvsPUuyGRq5kNlGVWCbaHNyEOHOE0v/xM7aOWpC3YLOJ66YdGF1ox5R30evhzHcsrGXte9oraJgv9R7C9LDyrOll2Bha%2BZLNsyYLrNhkFjr3ZFLj6Fs6AQDQAR7hSQrkhWIajQ%2BNNEBKA3j9SQ0EC6dLGvZtBj0Xumtkb9PkFp0oRFefurBJqbBjjlFJR46XaqLSFtNwEGAjihIPhRFdtSW1IzGqhOYrqWChpCmSM3kJ/ceJWebZg9HPs7Eo0i%2BA7Orp1Vc5/9xD9w7JKhoyf1ylOS2qLnEUBy%2BQW5fNcaniIekKKQ0T3cwjDobaWZzSzYRI24o4Khk2DinRQGs30G9n3/vMHEcjORIHaqMU1pjhlhWYj5sthUQMDx9Ins3rzG40WMGa3cv64cuh4Cdxc4Ehwm/1CAI3d79RKcIPnVUxLq8gni8rEilDPzkiyNPfmMc%2B7AW2eLIKVZNwN7ujECGSKQKZaUOFN6iudCZrV/EH1FVUFkGSAGtK8Z0JjjFrkF2XGMJQFIaR0YIwhvKPSahElc5VPmNY6EaKzcXIK0cgfdQ8KjD0YPCVwhFwa5LIHYdkluZT3EY428JFFudnrCHxoP5zdA5qQV3XAHEpswzhlAuKs1HPOkntdG9V1ZXmkRdqIKxYQZnr8CQWMOQjTaKDeduulvfFIWikJVh%2Bc26oHApOwQNcCiGh"},"gifad":{"imgurl":"","openurl":""},"showtime":3,"skipbtn":1,"expiretime":"2016-10-20","splashid":19637,"materialid":"393975","thirdadurl":"http%3A%2F%2Fadx.autohome.com.cn%2Fe%3Fz%3D26%26la%3D1047%26bidid%3D2084633c-6dcb-43a0-b42e-546cce7d535d%26pvid%3Da0069a06-03ec-4c9a-83d7-be0362f0741a0%26dvid%3D021676cd548e5cf2b6149c916a767228fac74da0%26bp%3D416%26wp%3D416,http%3A%2F%2Fstats.ipinyou.com%2Fqczj%2Ft.gif%3Fp%3DrSBgZFfLWnA5.6gfxVAlRO9Lr3mqbJmzKQpkKMNBTJsb6UYb3y5m60qRQrQsd.dFq8IM5.DS5jtA2SL6kh3MlhtYFrUrcH-vS90sED7hz5-D85WNc.DS5jtA2SL6kh3MlhtYFrUrcH-vS90sED7hz5-D85WNc.R.hM81TyXraw.QA.f.I.f.6.I.dPKzCwxpPemcXm5meYCpGDR6-ecVwmm_UhxA-5SHW6TVRI2j4Os16_*P1xcqx98MvmDtZBiegm0GxcAXyj20sED7huh-xblYNcGhMEFyFSP6pno_Nf.W.6OfSV0.QH.IP.MLs.mWn.EkZ.hb6h.NOAq.lcfz.Df.W.W.IsnMhK.VFFxt5L.5F1RQup0Bx17XgaI.QK.ubqJEYc.R6%26s%3D2HdP_pD8Vem8Qz1-duE1mX%26w%3D416,https%3A%2F%2Fstats.ipinyou.com%2Fstats%2Ft.gif%3Ftpp%3Dcfcd208495d565ef66e7dff9f98764da%26p%3DQWfsh_CLIin5.v_.Rh.WC.dxz.4ji.Wwg.gVEZ.8aVh.W.p%26s%3D5hdX4iDjKTRNA91vtXMMF0%26w%3DCKFlJmKiInTapBlBUKAbycrEp0ujz1PvBraXw_"}
     */

    private ResultBean result;

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int ishavead;
        private String pvid;
        private String rdposturl;
        private int areaid;
        /**
         * imgad : {"imgurl":"http://f1.p0y.cn/c/862/789342.jpg","openurl":"http://adx.autohome.com.cn/c?z=26&la=1047&bidid=2084633c-6dcb-43a0-b42e-546cce7d535d&pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0&dvid=021676cd548e5cf2b6149c916a767228fac74da0&u=PNJ%2BSyFzH/XQZI7K08EYJhFoS6y5kBGcxJcYpcyjZiEhVs0Av2FPblFwJZJc7I3FLEVaRyK%2BgEVUa1ufml6HluyyjaAIZlLeSU59oOJnsjMAtNkHZKVogMCYMSF8RRBLI%2Bni%2BMoKNSQo1F1MZ3LMot%2BJNQBSkhPGZSqicaZsEYsXpUMB/J45wBC71zg21HieQGz7/PQFvVMLsw0YmO4L/MSZg5Ab0lxvUf1q3vrVrAILJNQx98Zf1rlU8fI9DNeSMU93y4f1CRhVvAD/9nvj81Ero8qFejaeaPeM%2BtefYx/CjOxuDq7r1ZCLf2wMwo/WtcUar75p6ab9OOM5NE0AgUkd4AL/6DBirrqASO7EZ3unx1yTahPxr9QPWtDB4WOJQk8OKm%2BnF30FMvKB6jqJcJ4LMxuYA4mxSmjubeNi013LgtzpM47G/m7x5nWKyO6OM4bzgqw13spNhFdtuWrp4alfhmIec3rrdIXHcdbOX3wCEc4D7nFrddpQk5PxDiYeDQln7/rzFNtj9Jau1WFTiwAfO/P40nEKhc9m5OsK6rH74LVhqqbQtH31AlRypUim2PaKe9gLGwp8TKDYcI9IxPi/yLOa1icVLSIyMM4k47HQrix0KTI3Bwu3xZH5DO4cZquTJZ7FqvsPUuyGRq5kNlGVWCbaHNyEOHOE0v/xM7aOWpC3YLOJ66YdGF1ox5R30evhzHcsrGXte9oraJgv9R7C9LDyrOll2Bha%2BZLNsyYLrNhkFjr3ZFLj6Fs6AQDQAR7hSQrkhWIajQ%2BNNEBKA3j9SQ0EC6dLGvZtBj0Xumtkb9PkFp0oRFefurBJqbBjjlFJR46XaqLSFtNwEGAjihIPhRFdtSW1IzGqhOYrqWChpCmSM3kJ/ceJWebZg9HPs7Eo0i%2BA7Orp1Vc5/9xD9w7JKhoyf1ylOS2qLnEUBy%2BQW5fNcaniIekKKQ0T3cwjDobaWZzSzYRI24o4Khk2DinRQGs30G9n3/vMHEcjORIHaqMU1pjhlhWYj5sthUQMDx9Ins3rzG40WMGa3cv64cuh4Cdxc4Ehwm/1CAI3d79RKcIPnVUxLq8gni8rEilDPzkiyNPfmMc%2B7AW2eLIKVZNwN7ujECGSKQKZaUOFN6iudCZrV/EH1FVUFkGSAGtK8Z0JjjFrkF2XGMJQFIaR0YIwhvKPSahElc5VPmNY6EaKzcXIK0cgfdQ8KjD0YPCVwhFwa5LIHYdkluZT3EY428JFFudnrCHxoP5zdA5qQV3XAHEpswzhlAuKs1HPOkntdG9V1ZXmkRdqIKxYQZnr8CQWMOQjTaKDeduulvfFIWikJVh%2Bc26oHApOwQNcCiGh"}
         * gifad : {"imgurl":"","openurl":""}
         * showtime : 3
         * skipbtn : 1
         * expiretime : 2016-10-20
         * splashid : 19637
         * materialid : 393975
         * thirdadurl : http%3A%2F%2Fadx.autohome.com.cn%2Fe%3Fz%3D26%26la%3D1047%26bidid%3D2084633c-6dcb-43a0-b42e-546cce7d535d%26pvid%3Da0069a06-03ec-4c9a-83d7-be0362f0741a0%26dvid%3D021676cd548e5cf2b6149c916a767228fac74da0%26bp%3D416%26wp%3D416,http%3A%2F%2Fstats.ipinyou.com%2Fqczj%2Ft.gif%3Fp%3DrSBgZFfLWnA5.6gfxVAlRO9Lr3mqbJmzKQpkKMNBTJsb6UYb3y5m60qRQrQsd.dFq8IM5.DS5jtA2SL6kh3MlhtYFrUrcH-vS90sED7hz5-D85WNc.DS5jtA2SL6kh3MlhtYFrUrcH-vS90sED7hz5-D85WNc.R.hM81TyXraw.QA.f.I.f.6.I.dPKzCwxpPemcXm5meYCpGDR6-ecVwmm_UhxA-5SHW6TVRI2j4Os16_*P1xcqx98MvmDtZBiegm0GxcAXyj20sED7huh-xblYNcGhMEFyFSP6pno_Nf.W.6OfSV0.QH.IP.MLs.mWn.EkZ.hb6h.NOAq.lcfz.Df.W.W.IsnMhK.VFFxt5L.5F1RQup0Bx17XgaI.QK.ubqJEYc.R6%26s%3D2HdP_pD8Vem8Qz1-duE1mX%26w%3D416,https%3A%2F%2Fstats.ipinyou.com%2Fstats%2Ft.gif%3Ftpp%3Dcfcd208495d565ef66e7dff9f98764da%26p%3DQWfsh_CLIin5.v_.Rh.WC.dxz.4ji.Wwg.gVEZ.8aVh.W.p%26s%3D5hdX4iDjKTRNA91vtXMMF0%26w%3DCKFlJmKiInTapBlBUKAbycrEp0ujz1PvBraXw_
         */

        private AdBean ad;

        public int getIshavead() {
            return ishavead;
        }

        public void setIshavead(int ishavead) {
            this.ishavead = ishavead;
        }

        public String getPvid() {
            return pvid;
        }

        public void setPvid(String pvid) {
            this.pvid = pvid;
        }

        public String getRdposturl() {
            return rdposturl;
        }

        public void setRdposturl(String rdposturl) {
            this.rdposturl = rdposturl;
        }

        public int getAreaid() {
            return areaid;
        }

        public void setAreaid(int areaid) {
            this.areaid = areaid;
        }

        public AdBean getAd() {
            return ad;
        }

        public void setAd(AdBean ad) {
            this.ad = ad;
        }

        public static class AdBean {
            /**
             * imgurl : http://f1.p0y.cn/c/862/789342.jpg
             * openurl : http://adx.autohome.com.cn/c?z=26&la=1047&bidid=2084633c-6dcb-43a0-b42e-546cce7d535d&pvid=a0069a06-03ec-4c9a-83d7-be0362f0741a0&dvid=021676cd548e5cf2b6149c916a767228fac74da0&u=PNJ%2BSyFzH/XQZI7K08EYJhFoS6y5kBGcxJcYpcyjZiEhVs0Av2FPblFwJZJc7I3FLEVaRyK%2BgEVUa1ufml6HluyyjaAIZlLeSU59oOJnsjMAtNkHZKVogMCYMSF8RRBLI%2Bni%2BMoKNSQo1F1MZ3LMot%2BJNQBSkhPGZSqicaZsEYsXpUMB/J45wBC71zg21HieQGz7/PQFvVMLsw0YmO4L/MSZg5Ab0lxvUf1q3vrVrAILJNQx98Zf1rlU8fI9DNeSMU93y4f1CRhVvAD/9nvj81Ero8qFejaeaPeM%2BtefYx/CjOxuDq7r1ZCLf2wMwo/WtcUar75p6ab9OOM5NE0AgUkd4AL/6DBirrqASO7EZ3unx1yTahPxr9QPWtDB4WOJQk8OKm%2BnF30FMvKB6jqJcJ4LMxuYA4mxSmjubeNi013LgtzpM47G/m7x5nWKyO6OM4bzgqw13spNhFdtuWrp4alfhmIec3rrdIXHcdbOX3wCEc4D7nFrddpQk5PxDiYeDQln7/rzFNtj9Jau1WFTiwAfO/P40nEKhc9m5OsK6rH74LVhqqbQtH31AlRypUim2PaKe9gLGwp8TKDYcI9IxPi/yLOa1icVLSIyMM4k47HQrix0KTI3Bwu3xZH5DO4cZquTJZ7FqvsPUuyGRq5kNlGVWCbaHNyEOHOE0v/xM7aOWpC3YLOJ66YdGF1ox5R30evhzHcsrGXte9oraJgv9R7C9LDyrOll2Bha%2BZLNsyYLrNhkFjr3ZFLj6Fs6AQDQAR7hSQrkhWIajQ%2BNNEBKA3j9SQ0EC6dLGvZtBj0Xumtkb9PkFp0oRFefurBJqbBjjlFJR46XaqLSFtNwEGAjihIPhRFdtSW1IzGqhOYrqWChpCmSM3kJ/ceJWebZg9HPs7Eo0i%2BA7Orp1Vc5/9xD9w7JKhoyf1ylOS2qLnEUBy%2BQW5fNcaniIekKKQ0T3cwjDobaWZzSzYRI24o4Khk2DinRQGs30G9n3/vMHEcjORIHaqMU1pjhlhWYj5sthUQMDx9Ins3rzG40WMGa3cv64cuh4Cdxc4Ehwm/1CAI3d79RKcIPnVUxLq8gni8rEilDPzkiyNPfmMc%2B7AW2eLIKVZNwN7ujECGSKQKZaUOFN6iudCZrV/EH1FVUFkGSAGtK8Z0JjjFrkF2XGMJQFIaR0YIwhvKPSahElc5VPmNY6EaKzcXIK0cgfdQ8KjD0YPCVwhFwa5LIHYdkluZT3EY428JFFudnrCHxoP5zdA5qQV3XAHEpswzhlAuKs1HPOkntdG9V1ZXmkRdqIKxYQZnr8CQWMOQjTaKDeduulvfFIWikJVh%2Bc26oHApOwQNcCiGh
             */

            private ImgadBean imgad;
            /**
             * imgurl :
             * openurl :
             */

            private GifadBean gifad;
            private int showtime;
            private int skipbtn;
            private String expiretime;
            private int splashid;
            private String materialid;
            private String thirdadurl;

            public ImgadBean getImgad() {
                return imgad;
            }

            public void setImgad(ImgadBean imgad) {
                this.imgad = imgad;
            }

            public GifadBean getGifad() {
                return gifad;
            }

            public void setGifad(GifadBean gifad) {
                this.gifad = gifad;
            }

            public int getShowtime() {
                return showtime;
            }

            public void setShowtime(int showtime) {
                this.showtime = showtime;
            }

            public int getSkipbtn() {
                return skipbtn;
            }

            public void setSkipbtn(int skipbtn) {
                this.skipbtn = skipbtn;
            }

            public String getExpiretime() {
                return expiretime;
            }

            public void setExpiretime(String expiretime) {
                this.expiretime = expiretime;
            }

            public int getSplashid() {
                return splashid;
            }

            public void setSplashid(int splashid) {
                this.splashid = splashid;
            }

            public String getMaterialid() {
                return materialid;
            }

            public void setMaterialid(String materialid) {
                this.materialid = materialid;
            }

            public String getThirdadurl() {
                return thirdadurl;
            }

            public void setThirdadurl(String thirdadurl) {
                this.thirdadurl = thirdadurl;
            }

            public static class ImgadBean {
                private String imgurl;
                private String openurl;

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public String getOpenurl() {
                    return openurl;
                }

                public void setOpenurl(String openurl) {
                    this.openurl = openurl;
                }
            }

            public static class GifadBean {
                private String imgurl;
                private String openurl;

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public String getOpenurl() {
                    return openurl;
                }

                public void setOpenurl(String openurl) {
                    this.openurl = openurl;
                }
            }
        }
    }
}
