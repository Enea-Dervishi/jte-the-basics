@CleanUp
void call(context) {
    println "Splunk: end of the pipeline!" 
}
````

Push your code, then run the pipeline again and you should see logs at the end similar to:

``` text
[JTE][@CleanUp - splunk/splunk_pipeline_end.call]
[Pipeline] echo
Splunk: end of the pipeline!
[Pipeline] End of Pipeline
Finished: SUCCESS
