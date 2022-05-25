/*Copyright [2022] [Pablo Torres]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. */

/**@autor Pablo Torres*/


package mates;

//import java.lang.Math;

public class Matematicas{
	public static double generarNumeroPiIterativo(double darts){
		int i = 0;
		int numeracion = 0;
		double numeroPi = 0;
		double x = 0;
		double y = 0;
		while(i < darts) {
			x = Math.random();
			y = Math.random();
			if ((x * x) + (y * y) < 1) {
				numeracion++;
			}
			i++;
		}
		numeroPi = (numeracion / darts)*4;
		return numeroPi;
	}
}

