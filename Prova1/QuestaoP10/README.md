**Questão 10**
Ordene crescentes os elementos do vetor [3, 7, 1, 4, 9, 2], utilizando os seguintes algoritmos de ordenação: Bubble, selection e insertion sort. Mostrar o estado do vetor toda a vez que ocorrer uma troca de elementos. 

**RESPOSTA:**

Questão 10:
=======Bubble Sort:========
Vetor original:3 7 1 4 9 2
=============================
			3 1 7 4 9 2
			3 1 4 7 9 2
			3 1 4 7 2 9
			1 3 4 7 2 9
			1 3 4 2 7 9
			1 3 2 4 7 9
Em Ordem:   1 2 3 4 7 9 
============================	
		Selection Sort:
============================
			3 7 1 4 9 2 
			1 7 3 4 9 2
			1 2 3 4 9 7
Em Ordem:	1 2 3 4 7 9

===========================
Insertion Sort:
===========================
			3 7 1 4 9 2 
			3 7 7 4 9 2 
			3 3 7 4 9 2 
			1 3 7 4 9 2 
			1 3 7 7 9 2 
			1 3 4 7 9 2 
			1 3 4 7 9 9 
			1 3 4 7 7 9 
			1 3 4 4 7 9
			1 3 3 4 7 9
Em Ordem:	1 2 3 4 7 9
