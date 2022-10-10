public class WhileLoops {
    public static void main(String[] args) {
        // int number = 25;
        // while (number <= 30) {
        //     System.out.println(number);
        // }

        double choice = 0.01;
        double guess = 0.99;

        while (guess > choice) {
            guess = Math.random();      
            System.out.println(guess);
        }
    }
}
/*      
final output:           //is keeps on guessing a number until it prints out a number below 0.01 then it breaks
0.841891276184859
0.5490486137195182
0.9765511068537455
0.7864606051304146
0.5686818084309775
0.5179591548813858
0.4616519529259143
0.7802915047310645
0.46778691406045136
0.1345634357554215
0.45102810826370354
0.9273803993199043
0.6020678199809013
0.5937740625932715
0.9152567003951976
0.2775014817608207
0.8074922055962092
0.9248319020587398
0.42507465458482974
0.40561410674039977
0.9973874103329493
0.5140360930964546
0.4140712031162064
0.17546074435669812
0.33859739535363786
0.25008677454394834
0.7049010160159905
0.7846066775850237
0.46973927328099196
0.865802015297935
0.37204586026237096
0.7120456441349855
0.057733320525801046
0.7775084503102413
0.9057553699084602
0.30765975097841547
0.896005315960389
0.48219526417201675
0.8146482724668828
0.4122360863937894
0.4362379762907309
0.36255938633181006
0.2585577244162157
0.5774064750360289
0.11527423536756676
0.5713590036126268
0.038555057053182296
0.16679081100449455
0.0897512429040439
0.5190322053022001
0.28768879940525616
0.8627887495768083
0.023271638343688505
0.37232553341640107
0.5038265873451518
0.8778781524170813
0.3843941477563789
0.886717200672929
0.14508964645772637
0.4749432176830719
0.30845250641597455
0.8417085277091727
0.8687208197350509
0.2380688080014517
0.4521888158291485
0.32559578221571406
0.6358287919097223
0.903402187015109
0.42741261527822483
0.12512440213869036
0.3273026739357484
0.4590965069222699
0.338375414718995
0.5154660942385512
0.2202927816161051
0.6540156953156084
0.667275045580228
0.8172486340445272
0.6600048544238075
0.016793026813082257
0.25328231471967033
0.18990698270654516
0.5281565910062361
0.9800010574736204
0.39270808933380463
0.26441387682039197
0.6572968839737814
0.7286037559210288
0.1514057179776639
0.38348653594715365
0.1692899951907968
0.9475260713302642
0.8252306364511044
0.4136556554269004
0.8266179318164715
0.73009027033965
0.11035493995739609
0.32112163596106225
0.876756310529541
0.5272322717499486
0.9524615915920647
0.9621121787962137
0.5427304084871832
0.16682562481220342
0.23231984310146114
0.8284945289515201
0.26705958006840325
0.6531041791713196
0.41496913016516923
0.810684331758084
0.05164996205079331
0.6680893110107322
0.04071630044793195
0.39243278503812473
0.752796636607551
0.44009114822853823
0.468376589527572
0.07586213635955386
0.9883085273946993
0.9187674998169122
0.5946662710465985
0.2501589761428529
0.392870108358225
0.0018879489216200307

*/