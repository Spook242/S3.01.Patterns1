# SPRINT 3 
# TASCA 1
# NIVELL 1
# DESCRIPCIO
Singleton Pattern
Crea una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe serà utilitzada per la classe Main, que permetrà introduir opcions per consola.
La classe 'Undo' ha de guardar les últimes comandes introduïdes. Ha de permetre afegir o eliminar comandes, així com llistar les últimes comandes introduïdes (semblant a la comanda 'history' en Linux).
La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.

# SPRINT 3 
# TASCA 1
# NIVELL 2
# DESCRIPCIO
Abstract Factory
Crea un petit gestor de direccions i números de telèfon internacionals.
L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals. Tenint en compte els diferents formats dels diferents països, construeix l'agenda,
les adreces i els telèfons implementant un patró Abstract Factory.

# TECNOLOGIES UTILITZADES
Llenguatge de Programació: Java 11: El codi està configurat per compilar amb la versió 11 del JDK (segons el `pom.xml`). *
Gestió de Projectes: Apache Maven: Utilitzat per a la gestió de dependències, compilació i construcció del projecte (`pom.xml`).
Patrons de Disseny: Singleton: Implementat a la classe `Undo.java`. Aquest patró assegura que l'historial de comandes sigui únic i accessible globalment a tota l'aplicació.
Llibreries Estàndard de Java: `java.util.ArrayList`: Per emmagatzemar la llista dinàmica de comandes.
`java.util.Scanner`: Per a la lectura de dades des de la consola (input d'usuari). 

Gestió del Projecte i Control de Versions
Git: El sistema de control de versions que s'utilitza per rastrejar els canvis en els arxius del teu projecte.
GitHub: La plataforma de hosting (allotjament web) on puges el teu repositori Git per compartir-lo.
Terminal (CLI): L'eina de línia de comandes (com PowerShell, CMD, o Terminal de Mac/Linux) per executar comandaments de git i docker-compose.

# REQUISISTS
Per a Windows
Sistema Operatiu:
Recomanat: Windows 10 (versió 21H2 o superior) o Windows 11 (versió 21H2 o superior).
S'admeten les edicions Home, Pro, Enterprise o Education.
Hardware:
Processador de 64 bits amb traducció d'adreces de segon nivell (SLAT).
4 GB de RAM (es recomana 8 GB o més per a una bona experiència).
La virtualització de hardware ha d'estar activada a la BIOS/UEFI.
Per a macOS
Sistema Operatiu:
Hardware (Mac amb Apple Silicon - M1, M2, M3...)
4 GB de RAM (recomanat 8 GB o més).
Es recomana instal·lar Rosetta 2, ja que algunes eines opcionals de Docker encara ho poden necessitar.
Hardware (Mac amb Intel)
Model de Mac de 2010 o més recent.
Processador amb suport per a virtualització MMU (es pot comprovar a la terminal amb sysctl kern.hv_support).
4 GB de RAM (recomanat 8 GB o més).

# Execució:
Clonar el Repositori [https://github.com/EL_TEU_USUARI/EL_TEU_PROJECTE.git](https://github.com/EL_TEU_USUARI/EL_TEU_PROJECTE.git) # 
No requereix connexió a internet ni cap base de dades externa.
