//how to take input from a socket and generate output to a file?
int count;
byte[] buffer = new byte[8192]; // or 4096, or more
while ((count = in.read(buffer)) > 0)
{
  out.write(buffer, 0, count);
}




//Source: https://stackoverflow.com/questions/9520911


