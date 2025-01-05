package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgentAdressExpectedData {
    public static Map<Integer, List<Map<String, String>>> getExpectedData() {
        // Ana Map'i oluştur (grup numarası ve şirketler listesi)
        Map<Integer, List<Map<String, String>>> nestedMap = new HashMap<>();

        // Grup 1 için şirket bilgileri
        List<Map<String, String>> group1 = new ArrayList<>();

        Map<String, String> company1 = new HashMap<>();
        company1.put("name", "MCGRIFF INSURANCE SERVICES, LLC");
        company1.put("street", "2000 INTERNATIONAL PARK DR STE 600");
        company1.put("cityStateZip", "ALABAMA, BIRMINGHAM 35243-4221");
        company1.put("website", "www.mcgriff.com");
        group1.add(company1);

        Map<String, String> company2 = new HashMap<>();
        company2.put("name", "COBBS-ALLEN & HALL, INC.");
        company2.put("street", "305 S 5TH ST");
        company2.put("cityStateZip", "ALABAMA, GADSDEN 35901-4223");
        group1.add(company2);

        Map<String, String> company3 = new HashMap<>();
        company3.put("name", "MARSH & MCLENNAN AGENCY LLC");
        company3.put("street", "206 EXCHANGE PL NW");
        company3.put("cityStateZip", "ALABAMA, HUNTSVILLE 35806-2300");
        company3.put("website", "www.marsh.com");
        group1.add(company3);

        Map<String, String> company4 = new HashMap<>();
        company4.put("name", "EDGEWOOD PARTNERS INSURANCE CENTER ");
        company4.put("street", "2720 3RD AVE S STE 100");
        company4.put("cityStateZip", "ALABAMA, BIRMINGHAM 35233-2706");
        group1.add(company4);

        Map<String, String> company5 = new HashMap<>();
        company5.put("name", "WILLIS TOWERS WATSON SOUTHEAST INC");
        company5.put("street", "11 N WATER ST STE 19250");
        company5.put("cityStateZip", "ALABAMA, MOBILE 36602-3809");
        company5.put("website", "https://www.wtwco.com/en-US");
        group1.add(company5);

        Map<String, String> company6 = new HashMap<>();
        company6.put("name", "HARMON DENNIS BRADSHAW INC");
        company6.put("street", "4131 CARMICHAEL RD");
        company6.put("cityStateZip", "ALABAMA, MONTGOMERY 36106-2801");
        group1.add(company6);

        Map<String, String> company7 = new HashMap<>();
        company7.put("name", "J. R. PREWITT & ASSOCIATES, INC DBA THE PREWITT GR");
        company7.put("street", "2146 HIGHLAND AVE S");
        company7.put("cityStateZip", "ALABAMA, BIRMINGHAM 35205-4002");
        group1.add(company7);

        Map<String, String> company8 = new HashMap<>();
        company8.put("name", "HIGGINBOTHAM INSURANCE AGENCY, INC.");
        company8.put("street", "3212 MIDTOWN PARK S");
        company8.put("cityStateZip", "ALABAMA, MOBILE 36606-4128");
        company8.put("website", "https://www.higginbotham.com/");
        group1.add(company8);

        Map<String, String> company9 = new HashMap<>();
        company9.put("name", "COBBS ALLEN CAPITAL, LLC");
        company9.put("street", "115 OFFICE PARK DR, STE 200");
        company9.put("cityStateZip", "ALABAMA, BIRMINGHAM 35223");
        group1.add(company9);

        Map<String, String> company10 = new HashMap<>();
        company10.put("name", "CADENCE INSURANCE, INC.");
        company10.put("street", "7515 HALCYON SUMMIT DR STE 301");
        company10.put("cityStateZip", "ALABAMA, MONTGOMERY 36117-7020");
        group1.add(company10);

        nestedMap.put(1, group1);

        return nestedMap;
    }
}
