# Concorrenza_Veterinario

RICHIESTE:
Si scriva un programma concorrente che gestisca la sala di attesa di un veterinario nel seguente modo:
Un veterinario ha una sala d’attesa che può contenere solo cani e gatti
Un gatto non può entrare nella sala se sono già presenti un cane o un gatto
Un cane non può entrare nella sala se è già presente un gatto
Non ci possono essere più di 4 cani in tutto
Gli animali restano all’interno della stanza per un periodo di tempo randomico
Gli animali che non possono entrare attendono finchè diventa possibile

Risolvere il problema con synchronized, wait e notify:
implementando un metodo enterRoom e un metodo exitRoom
generando randomicamente animali (Thread) che chiamino i due metodi precedenti
