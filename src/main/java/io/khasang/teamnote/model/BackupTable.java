package io.khasang.teamnote.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * @author gothmog on 27.07.2017.
 */
public class BackupTable {

    @Autowired
    Environment environment;
    private String dumpAppPath = "C:\\Program Files\\PostgreSQL\\9.6\\bin\\pg_dump";
    private String dumpFolder = "C:\\Backup\\";


}
