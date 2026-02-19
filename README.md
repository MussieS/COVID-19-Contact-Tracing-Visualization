\# COVID-19 Contact Tracing Visualization (Java + BRIDGES)



This project models COVID-19 exposure risk using time-based contact data and visualizes potential transmission paths as a network graph using BRIDGES (Building Bridges).



\## What It Does

\- Loads user and contact data (CSV)

\- Computes contact duration and applies exposure rules (ex: 15+ minutes)

\- Identifies higher-risk connections based on time and proximity logic

\- Visualizes users and contacts as a graph (nodes and edges) in BRIDGES



\## Tech Stack

\- Java

\- NetBeans

\- BRIDGES (Building Bridges) API



\## How It Works (High Level)

1\. Read user and contact CSV files

2\. Convert contact start/end times to `LocalDateTime`

3\. Calculate duration per contact and apply exposure thresholds

4\. Build a graph:

&nbsp;  - nodes = users

&nbsp;  - edges = contacts (with attributes like duration/risk)

5\. Display the graph using BRIDGES visualization



\## How to Run

1\. Clone the repo:

&nbsp;  ```bash

&nbsp;  git clone https://github.com/MussieS/covid-19-contact-tracing-visualization.git



