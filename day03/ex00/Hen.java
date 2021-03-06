/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Hen.java                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kferterb <kferterb@student.21-school.ru    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/07/21 10:26:21 by kferterb          #+#    #+#             */
/*   Updated: 2022/07/21 11:10:32 by kferterb         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Hen extends Thread {
	
	private final int count;

	public Hen (int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.count; i++) {
			System.out.println("HEN");
		}
	}
}