db.createUser({
   user:"quarkus-user",
   pwd:"redhat-20",
   roles:[
            {
               role:"readWrite",
               db:"exampledb"
            }
         ]
      }
   )
