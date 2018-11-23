package test;

public class testClass {
	public static void main(String[] args) {

		//5 < 1 > 11 if ()
		//2 < X > 6
		//3 < 2 > 9
		
		int counter = 0;
		/*String aA = "", bA = "", cA = "", dA = "", eA = "", fA = "", gA = "", hA = "", iA = "", jA = "", kA = "",
				lA = "", mA = "", nA = ""; OPCION 1*/

		for (int a = 1; a < 4; a++) {

			for (int b = 1; b < 4; b++) {

				for (int c = 1; c < 4; c++) {

					for (int d = 1; d < 4; d++) {

						for (int e = 1; e < 4; e++) {

							for (int f = 1; f < 4; f++) {

								for (int g = 1; g < 4; g++) {

									for (int h = 1; h < 4; h++) {

										for (int i = 1; i < 4; i++) {

											for (int j = 1; j < 4; j++) {

												for (int k = 1; k < 4; k++) {

													for (int l = 1; l < 4; l++) {

														for (int m = 1; m < 4; m++) {

															for (int n = 1; n < 4; n++) {
																counter++;
																
																//OPCION 1
																/*if (a == 1) {aA = "1";} else if (a == 2) {aA = "X";} else if (a == 3) {aA = "2";}
																if (b == 1) {bA = "1";} else if (b == 2) {bA = "X";} else if (b == 3) {bA = "2";}
																if (c == 1) {cA = "1";} else if (c == 2) {cA = "X";} else if (c == 3) {cA = "2";}
																if (d == 1) {dA = "1";} else if (d == 2) {dA = "X";} else if (d == 3) {dA = "2";}
																if (e == 1) {eA = "1";} else if (e == 2) {eA = "X";} else if (e == 3) {eA = "2";}
																if (f == 1) {fA = "1";} else if (f == 2) {fA = "X";} else if (f == 3) {fA = "2";}
																if (g == 1) {gA = "1";} else if (g == 2) {gA = "X";} else if (g == 3) {gA = "2";}
																if (h == 1) {hA = "1";} else if (h == 2) {hA = "X";} else if (h == 3) {hA = "2";}
																if (i == 1) {iA = "1";} else if (i == 2) {iA = "X";} else if (i == 3) {iA = "2";}
																if (j == 1) {jA = "1";} else if (j == 2) {jA = "X";} else if (j == 3) {jA = "2";}
																if (k == 1) {kA = "1";} else if (k == 2) {kA = "X";} else if (k == 3) {kA = "2";}
																if (l == 1) {lA = "1";} else if (l == 2) {lA = "X";} else if (l == 3) {lA = "2";}
																if (m == 1) {mA = "1";} else if (m == 2) {mA = "X";} else if (m == 3) {mA = "2";}
																if (n == 1) {nA = "1";} else if (n == 2) {nA = "X";} else if (n == 3) {nA = "2";}*/
																
																//OPCION 2
																String prueba = a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j + "" + k + "" + l + "" + m + "" + n;
																
																prueba = prueba.replace("2", "X"); prueba = prueba.replace("3", "2");
																
																char[] valores = prueba.toCharArray();
																
																int uno = prueba.split("1", -1).length - 1;
																int x = prueba.split("X", -1).length - 1;
																int dos = prueba.split("2", -1).length - 1;
																
																if ((uno < 5 && uno > 11) && (x < 2 && x > 6) && (dos < 3 && dos > 9)) {
																	System.out.println(prueba);
																}
																
																/*System.out.println(aA + "" + bA + "" + cA + "" + dA + ""
																		+ eA + "" + fA + "" + gA + "" + hA + "" + iA
																		+ "" + jA + "" + kA + "" + lA + "" + mA + ""
																		+ nA);*/
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		System.out.println(counter);
	}
}
