/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kferterb <kferterb@student.21-school.ru    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/07/21 11:09:05 by kferterb          #+#    #+#             */
/*   Updated: 2022/07/21 11:27:40 by kferterb         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

class Program {

	public static void main(String[] args) {
		int count = 0;

		if (args.length != 1 || !args[0].startsWith("--count=")) {
			System.out.println("Wrong number of arguments");
			System.exit(-1);
		}

		Thread egg = new Egg(count);
		Thread hen = new Hen(count);

		egg.start();
		hen.start();
	}
}