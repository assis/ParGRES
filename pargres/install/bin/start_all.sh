rsh node9 "killall postmaster; ~/pgsql/bin/postmaster -D /scratch/db -i &>/dev/null &"
rsh node12 "killall postmaster; ~/pgsql/bin/postmaster -D /scratch/db -i &>/dev/null &"
rsh node13 "killall postmaster; ~/pgsql/bin/postmaster -D /scratch/db -i &>/dev/null &"
rsh node15 "killall postmaster; ~/pgsql/bin/postmaster -D /scratch/db -i &>/dev/null &"
rsh node16 "killall postmaster; ~/pgsql/bin/postmaster -D /scratch/db -i &>/dev/null &"
sleep 1
rsh node9 "killall java; cd pargres-0.1/bin;./run_nqp.sh 3001 tpch_sf2_5 &>/dev/null &"
rsh node12 "killall java; cd pargres-0.1/bin;./run_nqp.sh 3001 tpch_sf2_5 &>/dev/null &"
rsh node13 "killall java; cd pargres-0.1/bin;./run_nqp.sh 3001 tpch_sf2_5 &>/dev/null &"
rsh node15 "killall java; cd pargres-0.1/bin;./run_nqp.sh 3001 tpch_sf2_5 &>/dev/null &"
rsh node16 "killall java; cd pargres-0.1/bin;./run_nqp.sh 3001 tpch_sf2_5 &>/dev/null &"