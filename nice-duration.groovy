/**
 * return nice duration timestamp
 */

def version = '1.0'

def niceDuraton(duration) {
  def seconds = "echo \$(((\$(date +%s%N | cut -b1-13)-${duration})/1000));".text
   // http://unix.stackexchange.com/a/217604
  def hms = "echo \"\$(date -d \"1970-01-01 + ${seconds} seconds\" \"+%H hours %M minutes %S seconds\")\"".text
  return hms
}

return this;
