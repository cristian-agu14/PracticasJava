import java.util.ArrayList;
import java.util.List;

public class ObtenerIds {

	public static void main(String[] args) {

		String body = "[{\"idRule\":\"5de95b3fc9f71d0001e66429\",\"priority\":1,\"name\":\"Rule 1\",\"description\":\"Description 1\",\"state\":false,\"simpleRules\":[{\"correlationId\":\"fsds223\",\"parameter\":\"walletId\",\"comparisionOperatorName\":\"Mayor que\",\"value\":\"89\"},{\"correlationId\":\"22fs3\",\"parameter\":\"correlationId\",\"comparisionOperatorName\":\"Menor que\",\"value\":\"43\"},{\"correlationId\":\"qwer\",\"parameter\":\"correlationId\",\"comparisionOperatorName\":\"Igual que\",\"value\":\"22\"}],\"composeRules\":[{\"simpleRulesIds\":[\"fsds223\",\"22fs3\",\"qwer\"],\"logicalOperatorName\":[{\"ruleOne\":\"fsds22\",\"ruleTwo\":\"22fs\",\"operator\":\"AND\"},{\"ruleOne\":\"22fs3\",\"ruleTwo\":\"qwer\",\"operator\":\"AND\"}]}],\"decision\":\"GREEN\",\"createdDate\":\"05/12/2019 07:32:15 PM\",\"updateDate\":null,\"deleteDate\":\"\",\"userRegister\":\"ADMINTUYA\",\"userRemove\":\"\",\"userUpdate\":\"\",\"isDeleted\":false},{\"idRule\":\"5de99b41e05906000106ad52\",\"priority\":1,\"name\":\"Regla de prueba 1\",\"description\":\"Regla de prueba 1\",\"state\":true,\"simpleRules\":[{\"correlationId\":\"0\",\"parameter\":\"1\",\"comparisionOperatorName\":\"1\",\"value\":\"320\"},{\"correlationId\":\"1\",\"parameter\":\"2\",\"comparisionOperatorName\":\"2\",\"value\":\"5010673300\"}],\"composeRules\":[{\"simpleRulesIds\":[\"0\",\"1\"],\"logicalOperatorName\":[{\"ruleOne\":\"0\",\"ruleTwo\":\"1\",\"operator\":\"AND\"}]}],\"decision\":\"GREEN\",\"createdDate\":\"06/12/2019 12:05:21 AM\",\"updateDate\":null,\"deleteDate\":null,\"userRegister\":\"ADMINTUYA\",\"userRemove\":\"ADMINTUYA\",\"userUpdate\":\"ADMINTUYA\",\"isDeleted\":false},{\"idRule\":\"5de99b44aff3ba0001be173f\",\"priority\":1,\"name\":\"Regla de prueba 2\",\"description\":\"Regla de prueba 2\",\"state\":true,\"simpleRules\":[{\"correlationId\":\"0\",\"parameter\":\"1\",\"comparisionOperatorName\":\"2\",\"value\":\"320\"}],\"composeRules\":[{\"simpleRulesIds\":[\"0\"],\"logicalOperatorName\":[{\"ruleOne\":\"0\",\"ruleTwo\":\"\",\"operator\":\"\"}]}],\"decision\":\"RED\",\"createdDate\":\"06/12/2019 12:05:24 AM\",\"updateDate\":null,\"deleteDate\":null,\"userRegister\":\"ADMINTUYA\",\"userRemove\":\"ADMINTUYA\",\"userUpdate\":\"ADMINTUYA\",\"isDeleted\":false},{\"idRule\":\"5de99b46e05906000106ad53\",\"priority\":1,\"name\":\"Regla de prueba 3\",\"description\":\"Regla de prueba 3\",\"state\":true,\"simpleRules\":[{\"correlationId\":\"0\",\"parameter\":\"1\",\"comparisionOperatorName\":\"1\",\"value\":\"320\"},{\"correlationId\":\"1\",\"parameter\":\"2\",\"comparisionOperatorName\":\"1\",\"value\":\"5010673300\"},{\"correlationId\":\"2\",\"parameter\":\"3\",\"comparisionOperatorName\":\"1\",\"value\":\"D98765432104\"}],\"composeRules\":[{\"simpleRulesIds\":[\"0\",\"1\",\"2\"],\"logicalOperatorName\":[{\"ruleOne\":\"0\",\"ruleTwo\":\"1\",\"operator\":\"AND\"},{\"ruleOne\":\"1\",\"ruleTwo\":\"2\",\"operator\":\"AND\"}]}],\"decision\":\"YELLOW\",\"createdDate\":\"06/12/2019 12:05:26 AM\",\"updateDate\":null,\"deleteDate\":null,\"userRegister\":\"ADMINTUYA\",\"userRemove\":\"ADMINTUYA\",\"userUpdate\":\"ADMINTUYA\",\"isDeleted\":false},{\"idRule\":\"5de99b46126d6c0001e05cac\",\"priority\":1,\"name\":\"Regla de prueba 4\",\"description\":\"regla de prueba 4\",\"state\":true,\"simpleRules\":[{\"correlationId\":\"0\",\"parameter\":\"1\",\"comparisionOperatorName\":\"4\",\"value\":\"310\"},{\"correlationId\":\"1\",\"parameter\":\"1\",\"comparisionOperatorName\":\"6\",\"value\":\"319\"}],\"composeRules\":[{\"simpleRulesIds\":[\"0\",\"1\"],\"logicalOperatorName\":[{\"ruleOne\":\"0\",\"ruleTwo\":\"1\",\"operator\":\"AND\"}]}],\"decision\":\"GREEN\",\"createdDate\":\"06/12/2019 12:05:26 AM\",\"updateDate\":\"03/12/2019 04: 00:23 PM\",\"deleteDate\":null,\"userRegister\":\"ADMINTUYA\",\"userRemove\":\"ADMINTUYA\",\"userUpdate\":\"ADMINTUYA\",\"isDeleted\":false},{\"idRule\":\"5de99b49e05906000106ad54\",\"priority\":1,\"name\":\"Regla de prueba 5\",\"description\":\"Regla 5\",\"state\":true,\"simpleRules\":[{\"correlationId\":\"0\",\"parameter\":\"1\",\"comparisionOperatorName\":\"1\",\"value\":\"320\"},{\"correlationId\":\"1\",\"parameter\":\"2\",\"comparisionOperatorName\":\"4\",\"value\":\"100\"},{\"correlationId\":\"2\",\"parameter\":\"2\",\"comparisionOperatorName\":\"6\",\"value\":\"200\"}],\"composeRules\":[{\"simpleRulesIds\":[\"0\",\"1\",\"2\"],\"logicalOperatorName\":[{\"ruleOne\":\"0\",\"ruleTwo\":\"1\",\"operator\":\"AND\"},{\"ruleOne\":\"1\",\"ruleTwo\":\"2\",\"operator\":\"AND\"}]}],\"decision\":\"GREEN\",\"createdDate\":\"06/12/2019 12:05:29 AM\",\"updateDate\":\"03/12/2019 03: 50:23 PM\",\"deleteDate\":null,\"userRegister\":\"ADMINTUYA\",\"userRemove\":\"ADMINTUYA\",\"userUpdate\":\"ADMINTUYA\",\"isDeleted\":false}]\r\n"
				+ "";
		List<String> listaIds = new ArrayList<>();

		for (int i = 0; i < body.length() - 1; i++) {

			String pos1 = body.valueOf(body.charAt(i));
			String pos2 = body.valueOf(body.charAt(i + 1));

			if (pos1.equals("i") && pos2.equals("d")) {
				int x = i + 9;
				String idActual = body.substring(x, x + 24);
				System.out.println(idActual);
				listaIds.add(idActual);
			}

		}
	}

}
