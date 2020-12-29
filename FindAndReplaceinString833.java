/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.Vector;
import java.util.Collections;

public class FindAndReplaceinString833 {

    public void FindAndReplaceinString833() {
        String S = "ydrctlphryrwcelwquhlqpmrqaxgbfvwtnrvbaptfjkodhhivbwclspjldxaxwipwlfglbghdulrqxdcpxaptezogttqatiwujhwzpuveurnwsjdaqqnpfyuvihgagjyqnkmmwmsyxqjzfzvlnzzowxrjksohubkaoaeukvcomvbmcslumnndindhfuumhieoxxxshpygaivfpbjkksdpxaocdyppyjztawvbqkbioorfjfetowrblcycfnxvjriobxbyztnrtjrshwnwjxqacmcztxwajcagohobrmvrjzafijyfnphdibpjatzxhvtpselqatxkkxdqpmjspsqytdtkfgnybrxarmwvhmyesbibmxeftdoyefryydzzaedbmfwqjcqtrblrygelluoekdbpfalukhammbbaasjelbmmxxrktjxbnccpddnztxhpclghyeylioqqtzhadrtpgdcyemiojhmbqgafzlyvzuhrwturhqucmrjwkqvlrusrydduteizxzokldsyxihecrknfwjmobuxlhaxabylagfwpmkoslypcdwmpswjhapgmkwjusvikefkfvhjpwopupcatnvhyvhwyoitgwqpopljuikjodgqbqrsxmyffwriqxvpkbhrekbqoyknoejjnrhgkgpomvehdjqhebpwewlxihoxyyjjtyrbgrekypsgxyhhpxkjbakmklmmfqmwvmkkxmhlaqvhvecsvcjbrzablsycmhsiujjresmwecollpoomwzspdoqhngtpdjoplxoirerfuwizbydnltrjrmjetwyouckwhkkgulntgxbyqdvrlayykercdbghwtwcfspnlxxklltgeoyvlybjsninsqahkjhdwpdqeffqtsvamvctturqqpjptxxkvtsleceksbsixdlstlznwmzixqpbnimklaxpuqeamlsljogqweklklbuposawltjpnwzqigvpybhvmvjcskohs";
        int[] indexes = {833, 829, 166, 605, 312, 581, 455, 254, 559, 505, 670, 284, 694, 90, 592, 916, 588, 628, 194, 434, 62, 564, 953, 751, 599, 962, 491, 673, 654, 184, 700, 338, 288, 790, 146, 0, 521, 354, 38, 264, 960, 7, 900, 873, 191, 530, 840, 111, 54, 211, 704, 862, 643, 227, 120, 892, 987, 382, 536, 324, 939, 496, 244, 446, 838, 125, 663, 58, 365, 740, 615, 219, 52, 68, 508, 717, 27, 268, 685, 168, 970, 846, 824, 882, 635, 696, 976, 910, 304, 776, 397, 390, 276, 805, 545, 809, 151, 990, 224, 458};
        String[] sources = {"yqdvr", "tgxb", "vc", "yvhwyoit", "jatzxhvtpse", "usv", "yli", "riobx", "kosly", "kq", "ve", "ajc", "yr", "tqatiwujhwzpuveurnw", "jpw", "sleceks", "kf", "qbqrs", "xx", "jxb", "ip", "pcdwmpswjhapgmkw", "am", "ycmhsiujjresmwecollpoomwz", "catnv", "weklk", "hrwt", "djq", "yknoejjn", "hfuumhi", "kyps", "sqyt", "gohobrmvrjzafijy", "lxoirerfuwi", "zzowx", "ydrct", "xzokld", "mwvhmyesbib", "ptfj", "rt", "gq", "hryrwcelwqu", "ctturqqpj", "jsnin", "eo", "ihecrk", "yyker", "da", "pj", "dpxa", "gxy", "lltge", "vpkb", "vbqkbioor", "vih", "fq", "ybh", "ed", "nf", "qat", "qpbnimklaxpu", "rhqucm", "blcycfn", "xhpcl", "la", "gjyqnkmmwmsyx", "hgkg", "xax", "mxe", "svcjbrzab", "qpoplj", "ppyj", "ls", "lbghdulrqxd", "lrusryddu", "klmmfq", "gbfvwtnrvba", "shw", "ih", "omvb", "pos", "dbghwtwcfsp", "kguln", "kjhdwp", "yffwriq", "bgr", "tj", "txxkvt", "fnphdibp", "sp", "ygelluoekdbpfalukhammbbaasjelbm", "cqtrb", "acmczt", "nltr", "lhaxa", "jrmjetwyou", "rjksohubkao", "vmvjcskohs", "ta", "oqqtzhadrtpgdcyemiojhmbq"};
        String[] targets = {"yylryi", "fgllo", "fwl", "kdhuhxvzr", "cvqhuzuoqy", "uia", "jjr", "vqfu", "cmwv", "hsi", "q", "qu", "v", "vvdcranjoawfmfrlmwx", "ytpw", "bedngobl", "sb", "zivt", "l", "wg", "g", "xxfnekbbvfbttmsaz", "s", "orsnfdemeugdbrhxoeqdrykhr", "ajbovn", "dglsi", "lfr", "dl", "dvmlejzh", "cqvogr", "vzimb", "bajwe", "jarxzfmrvrctxmud", "fysddvymir", "zhnopi", "khtyxs", "liqpp", "dtuacadhptc", "ubzur", "usa", "cu", "wuozjmtdatau", "utztuhspo", "aymcuy", "eeq", "onjmpw", "adje", "m", "jsn", "fsxsg", "kup", "esad", "fyq", "urtlewdiuy", "jxdh", "um", "bki", "gt", "f", "sxwa", "tfyoddzwkdvfl", "ffcwxtq", "jwkxzs", "tnnid", "f", "viudpwckuiue", "vctgw", "wd", "oki", "jzxxdilvxo", "gtatiw", "jtb", "hm", "ivfytknzvz", "aafzwoxoiw", "wdjkt", "zwdzijemosr", "tlsn", "j", "pdcck", "agnc", "xplpczgqpz", "ieinaw", "uyrmwuk", "adfardf", "wo", "e", "hxwgk", "owrxbdopw", "ml", "srfofdjqkcmpjtltzeuyfpvkgaudadx", "xqhay", "bnwnlrr", "xrqc", "zbiua", "zrxdspxjx", "tavesyitod", "bebfxxjat", "j", "iqvluqothwqbbygwrgeasavr"};
        StringBuffer sTextModify = new StringBuffer(S);
        Vector<orderElements> vList = new Vector();
        for (int i = 0; i < indexes.length; i++) {
            vList.add(new orderElements(indexes[i], sources[i], targets[i]));
        }
        Collections.sort(vList);
        for (int i = 0; i < sources.length; i++) {
            if (searchPositionFound(sTextModify.toString(), vList.get(i).getsSearchText()).indexOf(vList.get(i).getiPosition()) != -1) {
                sTextModify.replace(vList.get(i).getiPosition(),
                        vList.get(i).getiPosition() + vList.get(i).getsSearchText().length(), vList.get(i).getsNewText());
            }
        }
    }

    public class orderElements implements Comparable<orderElements> {

        int iPosition;
        String sSearchText;
        String sNewText;

        public int compareTo(orderElements elem) {
            if (elem.iPosition > getiPosition()) {
                return 1;
            }
            if (elem.iPosition < getiPosition()) {
                return -1;
            }
            return 0;
        }

        public int getiPosition() {
            return iPosition;
        }

        public String getsSearchText() {
            return sSearchText;
        }

        public String getsNewText() {
            return sNewText;
        }

        public orderElements(int iPosition, String sSearchText, String sNewText) {
            this.iPosition = iPosition;
            this.sSearchText = sSearchText;
            this.sNewText = sNewText;
        }
    }

    public Vector<Integer> searchPositionFound(String sValue, String sSub) {
        Vector<Integer> vListPositions = new Vector();
        StringBuilder sTextValue = new StringBuilder(sValue);
        int iPosition = sTextValue.indexOf(sSub);
        while (iPosition != -1) {
            sTextValue.replace(iPosition, iPosition + 1, "-");
            vListPositions.add(iPosition);
            iPosition = sTextValue.indexOf(sSub);
        }
        return vListPositions;
    }
}
//"acbfhffhsdf"
//[1,3,6,8]
//["ac","fh","fh","f"]
//["z","z","z","z"]
//
//"acbfhfghsdf"
//[1,3,6,8]
//["ac","fh","fh","f"]
//["z","z","z","z"]
//
//"acbfhfghsdf"
//[1, 3, 6, 8]
//["ac", "fh", "gh", "f"]
//["z", "z", "z", "z"]

//"abcd"
//[0, 2]
//["a", "cd"]
//["eee", "ffff"]
//"abcd"
//[0, 2]
//["ab","ec"]
//["eee","ffff"]
//"acbfhffhsdf"
//[1,3,6,8]
//["ac","fh","fh","f"]
//["z","z","z","z"]
//"acbfhfghsdf"
//[1,3,6,8]
//["ac","fh","fh","f"]
//["z","z","z","z"]
//"acbfhfghsdf"
//[1, 3, 6, 8]
//["ac", "fh", "gh", "f"]
//["z", "z", "z", "z"]
//"frheltogokypgwyoafpp"
//[15,10,8,5,17,2]
//["oa","yp","ok","tog","fp","hel"]
//["fth","ml","vky","fw","k","yzat"]
